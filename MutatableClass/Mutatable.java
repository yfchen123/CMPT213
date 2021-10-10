import java.util.Date;

/**
 * Because Date is a mutatable class we will be able to have some
 * side effects.
 */
public class Mutatable {
    private String mutatableName;
    private Date dateCreated;


    public Mutatable(String mutatableName, Date dateCreated) {
        this.mutatableName = mutatableName;
        this.dateCreated = dateCreated;
    }


    public String getMutatableName() {
        return mutatableName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setMutatableName(String mutatableName) {
        this.mutatableName = mutatableName;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Mutatable{" +
                "mutatableName='" + mutatableName + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
