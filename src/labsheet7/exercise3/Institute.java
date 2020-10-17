package labsheet7.exercise3;

public class Institute {
    private String instituteName;
    private Department departments[];

    public Institute(String instituteName, Department[] departments){
        setInstituteName(instituteName);
        setDepartments(departments);

    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String toString(){
        String str = "Name: " + getInstituteName() + "\n\nDepartments: ";

        for(int i =0;i<getDepartments().length;i++)
            if(departments[i]!=null)
                str+=departments[i];

            return str;
    }


    public int getTotalStudents() {

        int noOfStudents = 0;
        Student[] students;

        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != null) {
                students = departments[i].getStudents();

                for (int j = 0; j < students.length; j++) {
                    if (students[i] != null)
                        noOfStudents++;
                }
            }


        }
        return noOfStudents;
    }
}
