public class UserBuilder {
    private User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder withFirstname(String firstname) {
        user.setFirstname(firstname);
        return this;
    }

    public UserBuilder withJobTitle(String jobTitle) {
        user.setJobTitle(jobTitle);
        return this;
    }

    public UserBuilder withLastname(String lastname) {
        user.setLastname(lastname);
        return this;
    }

    // ... Repeat for other fields

    public User build() {
        return user;
    }
}