public class User {
    private String firstname;
    private String lastname;
    private String jobTitle;


    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return firstname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getLastname() {
        return lastname;
    }
}
