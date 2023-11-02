package org.launchcode.techjobs.oo;

//import org.junit.Assert.*;
//import java.lang.System.*;
//import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
}
