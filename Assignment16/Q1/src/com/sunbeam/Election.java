package com.sunbeam;

import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

//		try(CandidateDao dao = new CandidateDao()) {
//			System.out.print("Enter candidate id (to vote): ");
//			int candidateId = sc.nextInt();
//			int cnt = dao.incrementVote(candidateId);
//			System.out.println("Rows updated: " + cnt);
//		} // dao.close();
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try(CandidateDao dao = new CandidateDao()) {
//			System.out.println("Enter name of new candidate: ");
//			String name = sc.next();
//			System.out.println("Enter candidate party: ");
//			String party = sc.next();
//			System.out.println("Enter vote: ");
//			int votes = sc.nextInt();
//			Candidate a = new Candidate(0, name, party,votes);
//			int cnt= dao.save(a);
//			System.out.println("Rows Updated: "+cnt);
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//			
//		}
	
//		try(CandidateDao dao = new CandidateDao()) {
//			System.out.println("Enter candiadate id to modify details");
//			int id = sc.nextInt();
//			System.out.println("Enter candidate party:");
//			String party = sc.next();
//			System.out.println("Enter candidate name: ");
//			String name = sc.next();
//			Candidate a = new Candidate(id, name, party, 0);
//			int cnt= dao.update(a);
//			System.out.println("Rows updated"+cnt);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
		List<PartyVotes> getPartywiseVotes(){
			
			
		}
		
	}
}

