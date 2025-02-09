package other;

import java.util.ArrayList;
import java.util.List;
public class Resume {


    public static void main(String[] args) {
        Developer developer = new Developer("Filip Tvrdoň");
        developer.setSpecialization("Java/Full-Stack other.Developer");
        developer.addSkills("Java", "Spring Framework", "Spring Boot");
        developer.addSkills("Junit", "Mockito", "OpenAPI");
        developer.addSkills("Typescript", "React", "AgGrid");
        developer.addSkills("PostgreSQL", "PL/PostgreSQL", "Apache Solr");
        developer.addSkills("CI/CD, Docker, Git, GitHub, Azure DevOps");
        developer.addSkills("SonarQube, BlackDuck");
        developer.addLanguages("English", "fluent", "German", "intermediate");
    }


                                                                                                    }
class Developer {
    private String name;
    private String title;
    private String description;
    private List<Experience> experiences = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<String> skills = new ArrayList<>();
    private List<String> certifications = new ArrayList<>();

    public Developer(String name) {
        this.name = name;
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addExperience(Experience experience) {
        experiences.add(experience);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void addSkills(String... skills) {
        this.skills.addAll(List.of(skills));

    }

    public void addLanguages(String... languages) {
        this.skills.addAll(List.of(languages));

    }

    public void addFrontendSkills(String... skills) {
        this.skills.addAll(List.of(skills));

    }

    public void addDatabaseSkills(String... skills) {
        this.skills.addAll(List.of(skills));

    }

    public void addCertification(String certification) {
        certifications.add(certification);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);

        System.out.println("\nother.Experience:");
        experiences.forEach(System.out::println);

        System.out.println("\nProjects:");
        projects.forEach(System.out::println);

        System.out.println("\nSkills: " + String.join(", ", skills));

        System.out.println("\nCertifications: " + String.join(", ", certifications));
    }

    public void addShortDesc(String s) {
        this.skills.add(s);
    }

    public void setSpecialization(String s) {
    }
}

class Experience {
    private String company;
    private String position;
    private String duration;
    private String description;

    public Experience(String company, String position, String duration, String description) {
        this.company = company;
        this.position = position;
        this.duration = duration;
        this.description = description;
    }

    @Override
    public String toString() {
        return position + " at " + company + " (" + duration + ") - " + description;
    }
}

class Project {
    private String name;
    private String technology;
    private String description;

    public Project(String name, String technology, String description) {
        this.name = name;
        this.technology = technology;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " (" + technology + ") - " + description;
    }
}
