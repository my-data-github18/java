package com.sunbeam;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartyVotesDao implements AutoCloseable {
private Connection con;

public PartyVotesDao() throws SQLException {
con = DbUtil.getConnection();
}

@Override
public void close() {
try {
if (con != null)
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
// get partywise vote count
public List<PartyVotes> getPartyWiseVotes() throws SQLException {
List<PartyVotes> pvlist = new ArrayList<>();
String sql = "SELECT party,sum(votes) tvotes FROM candidates group by party";
try(PreparedStatement stmt = con.prepareStatement(sql)) {
try(ResultSet rs = stmt.executeQuery()) {
while(rs.next()){
String party=rs.getString("party");
int votes = rs.getInt("tvotes");
pvlist.add(new PartyVotes(party, votes));
}
} // rs.close();
} // stmt.close();
return pvlist;
}
}
