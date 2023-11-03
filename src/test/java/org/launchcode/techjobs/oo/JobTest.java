package org.launchcode.techjobs.oo;

//import org.junit.Assert.*;
//import java.lang.System.*;
//import org.junit.jupiter.api.Test;

import org.hamcrest.core.StringStartsWith;
import org.junit.Test;

import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.*;
public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
       Job test_job1 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
        Job test_job2 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
       assertNotEquals(test_job1.getId(), test_job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job1 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
   assertEquals(test_job1.getName(),"Super Silly Computer Salesman");
   assertEquals(test_job1.getEmployer(),"AFRC Federal");
   assertEquals(test_job1.getLocation(), "New Jersey");
   assertEquals(test_job1.getPositionType(), "Super Sales");
   assertEquals(test_job1.getCoreCompetency(), "Gall");
    }
    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
        Job test_job2 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
        assertNotEquals(test_job1, test_job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_job1 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
   assertTrue(test_job1.toString().startsWith("\n"));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job1 = new Job ("Super Silly Computer Salesman",new Employer("AFRC Federal"),new Location("New Jersey"),new PositionType("Super Sales"),new CoreCompetency("Gall"));
   String string_test_job1 =  "\n" +"ID: " + 1 + "\n" + "Name: " + "Super Silly Computer Salesman" + "\n"+"Employer: " + "AFRC Federal" + "\n" +
           "Location: " + "New Jersey" + "\n" + "Position Type: " + "Super Sales" + "\n" + "Core Competency: " + "Gall" + "\n";
        assertEquals(test_job1.toString(), string_test_job1);
    }

   @Test
   public void testToStringHandlesEmptyField(){
       Job test_job2 = new Job ("Super Silly Computer Salesman",new Employer(""),new Location(""),new PositionType("Super Sales"),new CoreCompetency("Gall"));
       String string_test_job2 =  "\n" +"ID: " + 1 + "\n" + "Name: " + "Super Silly Computer Salesman" + "\n"+"Employer: " + "Data not available" + "\n" +
               "Location: " + "Data not available" + "\n" + "Position Type: " + "Super Sales" + "\n" + "Core Competency: " + "Gall" + "\n";
       assertEquals(test_job2.toString(), string_test_job2);
    }
}
