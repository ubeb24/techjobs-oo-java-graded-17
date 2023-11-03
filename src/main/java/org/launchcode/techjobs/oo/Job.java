package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public Job (){
        id = nextId;
        nextId++;
    }
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
//  if (id == int || name == null || name == "" || employer == null || employer == "" || location == null || location == "" || positionType == null || positionType == ""|| coreCompetency == null || coreCompetency == "") {
//        return "Data not available";
    //employer.getValue().isBlank() location.getValue().isBlank() positionType.getValue().isBlank() coreCompetency.getValue().isBlank()) {
    //  return "Data not available";

    //String stringFormatNoId = "\n" + "ID: " + "Data not available" + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" +
    //                "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency + "\n";
    //    return stringFormatNoId;
    //               } else if (name.isBlank()) {
    //            String stringFormatNoName = "\n" + "ID: " + id + "\n" + "Name: " + "Data not Available" + "\n" + "Employer: " + employer + "\n" +
    //                    "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency + "\n";
    //            return stringFormatNoName;
    //        } else if (employer.getValue().isBlank()) {
    //            String stringFormatNoEmployer = "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + "Data not Available" + "\n" +
    //                    "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency + "\n";
    //            return stringFormatNoEmployer;
    //        } else if (location.getValue().isBlank()) {
    //            String stringFormatNoLocation = "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" +
    //                    "Location: " + "Data not Available" + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency + "\n";
    //            return stringFormatNoLocation;
    //        } else if (positionType.getValue().isBlank()) {
    //            String stringFormatNoPositionType = "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" +
    //                    "Location: " + location + "\n" + "Position Type: " + "Data not Available" + "\n" + "Core Competency: " + coreCompetency + "\n";
    //            return stringFormatNoPositionType;
    //        } else if (coreCompetency.getValue().isBlank()){
    //            String stringFormatNoCoreCompetency = "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" +
    //                    "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + "Data not Available" + "\n";
    //            return stringFormatNoCoreCompetency;

    //                   String stringFormat = "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" +
//                    "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency + "\n";
    @Override
    public String toString() {
         String IdFormat = "\n" + "ID: " + id;
         String NameFormat = "\n" + "Name: " + name;
         String EmployerFormat = "\n" + "Employer: " + employer;
         String LocationFormat = "\n" + "Location: " + location;
         String PTFormat = "\n" + "Position Type: " + positionType;
         String CCFormat = "\n" + "Core Competency: " + coreCompetency;
         if (id == 0) {
             IdFormat = "\n" + "ID: " + "Data not available";
         }
         if (name.isBlank()) {
             NameFormat = "\n" + "Name: " + "Data not available";
         }
         if (employer.getValue().isBlank()) {
            EmployerFormat = "\n" + "Employer: " + "Data not available";
        }
         if (location.getValue().isBlank()) {
          LocationFormat = "\n" + "Location: " + "Data not available";
        }
         if (positionType.getValue().isBlank()) {
            PTFormat = "\n" + "Position Type: " + "Data not available";
        }
         if (coreCompetency.getValue().isBlank()){
        CCFormat = "\n" + "Core Competency: " + "Data not available";
        }
               String stringFormat = IdFormat + NameFormat + EmployerFormat + LocationFormat + PTFormat + CCFormat +"\n";
         return stringFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
