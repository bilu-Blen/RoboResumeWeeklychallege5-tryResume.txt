package me.Blen;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        try{

            Scanner scan = new Scanner(System.in);

                    String yesToResume = "y";
                    do {

                        //creating an object instance to the new user and
                        Resume resumeUserOne = new Resume();

                        //prompting the user to enter a name
                        System.out.println("Welcome, enter your name");
                        String userOneName = scan.nextLine();

                        //prompting the user to enter an email
                        System.out.println("Enter your email");
                        String userOneEmail = scan.nextLine();

                        //prompting the user to enter a phone number
                        System.out.println("Enter your phone number");
                        int userOnePhone = scan.nextInt();
                        scan.nextLine();

                        // giving the user entry value
                        resumeUserOne.setName(userOneName);
                        resumeUserOne.setEmail(userOneEmail);
                        resumeUserOne.setPhoneNumber(userOnePhone);

                        //prompting the user to choose if they want to enter an education achievement
                        System.out.println("Would you like to enter an educational achievement. Y/N");
                        String eduChoice = scan.nextLine();

                        while (eduChoice.equalsIgnoreCase("Y")) {
                            //prompting the user to enter school name
                            System.out.println("Enter your first educational achievement. Start by entering the school name");
                            String userOneSchoolName = scan.nextLine();

                            //prompting the user to enter year
                            System.out.println("enter the your graduation year");
                            int userOneGradYear = scan.nextInt();
                            scan.nextLine();

                            //prompting the user to enter degree
                            System.out.println("enter the your degree");
                            String userOneDegree = scan.nextLine();

                            //prompting the user to enter major
                            System.out.println("enter the your major");
                            String userOneMajor = scan.nextLine();

                            //creating an instance of education to that user and setting up a value for each
                            Education educationUserOne = new Education();
                            educationUserOne.setSchool(userOneSchoolName);
                            educationUserOne.setYear(userOneGradYear);
                            educationUserOne.setDegree(userOneDegree);
                            educationUserOne.setMajor(userOneMajor);

                            //giving the educational list to the user
                            resumeUserOne.getEducationalAchievements().add(educationUserOne);

                            //prompting the user to choose if they want to enter another education achievement
                            System.out.println("Would you like to enter another educational achievement. Y/N");
                            eduChoice = scan.nextLine();

                        }

                        //prompting the user to choose if they want to enter an experiences
                        System.out.println("Would you like to enter your experience. Y/N");
                        String experienceChoice = scan.nextLine();

                        while (experienceChoice.equalsIgnoreCase("Y")) {
                            //prompting the user to enter the company name
                            System.out.println("Enter your Experience. Start by entering the company name");
                            String userOneCompanyName = scan.nextLine();

                            //prompting the user to enter title
                            System.out.println("enter the your title");
                            String userOneTitle = scan.nextLine();

                            //prompting the user to enter date
                            System.out.println("enter the  date");
                            int userOneDate = scan.nextInt();
                            scan.nextLine();

                            //prompting the user to enter job description
                            System.out.println("enter the your description");
                            String userOneDescription = scan.nextLine();

                            //creating an instance of education to that user and setting up a value for each
                            Experience experienceUserOne = new Experience();
                            experienceUserOne.setCompany(userOneCompanyName);
                            experienceUserOne.setTitle(userOneTitle);
                            experienceUserOne.setDate(userOneDate);
                            experienceUserOne.setDescription(userOneDescription);

                            //giving the educational list to the user
                            resumeUserOne.getExperiencesList().add(experienceUserOne);

                            //prompting the user to choose if they want to enter another experience
                            System.out.println("Would you like to enter another experience. Y/N");
                            experienceChoice = scan.nextLine();

                        }

                        //prompting the user to choose if they want to enter a skill
                        System.out.println("Would you like to enter your skill. Y/N");
                        String skillChoice = scan.nextLine();
                        while (skillChoice.equalsIgnoreCase("Y")) {
                            //prompting the user to enter the skill name
                            System.out.println("Enter your skill. Start by entering the skill name");
                            String userOneSkillName = scan.nextLine();

                            //prompting the user to enter title
                            System.out.println("enter the your competency on this skill");
                            String userOneCompetency = scan.nextLine();

                            //creating an instance of education to that user and setting up a value for each
                            Skill skillUserOne = new Skill();
                            skillUserOne.setName(userOneSkillName);
                            skillUserOne.setCompetency(userOneCompetency);

                            //giving the educational list to the user
                            resumeUserOne.getSkillList().add(skillUserOne);

                            //prompting the user to choose if they want to enter another skill
                            System.out.println("Would you like to enter another skill. Y/N");
                            skillChoice = scan.nextLine();

                        }

                        System.out.println("Your resume looks like this!");

                        System.out.println(resumeUserOne.getName() + "\n" + resumeUserOne.getEmail() + "\n\n" +
                                "Education");
                        for (Education edu : resumeUserOne.getEducationalAchievements()) {
                            System.out.println(edu.getDegree() + "\n" + edu.getSchool() + "," + edu.getYear());
                        }

                        for (Experience exe : resumeUserOne.getExperiencesList()) {
                            System.out.println(exe.getTitle() + "\n" + exe.getCompany() + exe.getDate() + "\n- " + exe.getDescription());
                        }

                        for (Skill eachSkill : resumeUserOne.getSkillList()) {
                            System.out.println(eachSkill.getName() + ", " + eachSkill.getCompetency());
                        }




                        System.out.println("Would you like to enter another Resume. Y/N");
                        yesToResume = scan.nextLine();


            } while (yesToResume.equalsIgnoreCase("y"));
            PrintStream printStream = new PrintStream(new BufferedOutputStream(new FileOutputStream("resume2.txt")), true);
            System.setOut(printStream);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
