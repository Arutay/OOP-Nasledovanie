package driver;

public abstract class Driver {

    private String name;
    private boolean hasDriverLicence;
    private int experienceInYears;

    public Driver(String name,
                  boolean hasDriverLicence,
                  int experienceInYears) {
        this.name = name;
        this.hasDriverLicence = hasDriverLicence;
        this.experienceInYears = experienceInYears;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public boolean isHasDriverLicence(){return hasDriverLicence;}
    public void setHasDriverLicence(boolean hasDriverLicence) {
        boolean hasDriverLicence1 = this.hasDriverLicence;
    }
    public int getExperienceInYears (){return experienceInYears;}
    public void setExperienceInYears(int experienceInYears){
        int experienceInYears1 = this.experienceInYears;
    }
    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();
}
