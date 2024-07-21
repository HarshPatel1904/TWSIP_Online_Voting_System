import java.util.*;

class Voting_System{
    int party_A;
    int party_B;
    int party_C;
    int candidates;
    String name;
    String number;
    int vote;
    Scanner sc = new Scanner(System.in);

    void voting(){
        System.out.print("Enter the number of candidates : ");
        candidates = sc.nextInt();
        while(candidates>0){
            System.out.print("Enter the name : ");
            name = sc.next();
            System.out.print("Enter the phone number : ");
            number = sc.next();
            while(number.length()!=10){
                System.out.println("Invalid Number");
                System.out.print("Enter the phone number : ");
                number = sc.next();
            }
            System.out.println("-----------------------Welcome To Voting System----------------------------------");
            System.out.println("Press 1 to Vote For Party A ");
            System.out.println("Press 2 to Vote for Party B ");
            System.out.println("Press 3 to Vote for Party C ");
            System.out.print("Enter Your Vote : ");
            vote = sc.nextInt();
            if(vote==1){
                party_A++;
                candidates--;
                System.out.println("Voting Successful");
            }
            else if(vote==2){
                party_B++;
                candidates--;
                System.out.println("Voting Successful ");
            }
            else if(vote==3){
                party_C++;
                candidates--;
                System.out.println("Voting Successful ");
            }
            else{
                System.out.println("Invalid Vote ");
            }
        }
        System.out.println("------------------------------Thank You For Voting----------------------------------");
    }

    void results(){
        System.out.println("----------------------------------Results------------------------------");
        System.out.println("Total Number of Votes Of Party A is : " + party_A);
        System.out.println("Total Number of Votes of Party B is : " + party_B);
        System.out.println("Total Number of Votes of Party C is : " + party_C);
        if(party_A>party_B && party_A>party_C){
            System.out.println("Party A has maximum number of Votes ");
        }
        else if(party_B>party_A && party_B>party_C){
            System.out.println("Party B has maximum number of Votes ");

        }
        else if(party_C>party_A && party_C>party_B){
            System.out.println("Party C has maximum number of Votes ");
        }
        else if(party_A==party_B){
            System.out.println("There is a tie between parties A and B ");
        }
        else if(party_A==party_C){
            System.out.println("There is a tie between parties A and C ");
        }
        else if(party_B==party_C){
            System.out.println("There is a tie between parties B and C ");
        }
        else if(party_A==party_B && party_A==party_C){
            System.out.println("There is a tie between parties A, B and C ");
        }
        else{
            System.out.println("No Voting Take Place ");
        }
    }

}

public class OnlineVotingSystem{
    public static void main(String[] args) {
        Voting_System v1 = new Voting_System();
        v1.voting();
        v1.results();
    }
}