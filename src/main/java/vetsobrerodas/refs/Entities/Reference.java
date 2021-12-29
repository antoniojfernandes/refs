package vetsobrerodas.refs.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reference")
public class Reference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "clientName", nullable = false)
    private String clientName;
    @Column(name = "clientPhone", nullable = false)
    private String clientPhone;
    @Column(name = "clientEmail", nullable = false)
    private String clientEmail;
    @Column(name = "clientPetName", nullable = false)
    private String clientPetName;
    @Column(name = "isMember", nullable = false)
    private Boolean isMember;


    public Reference(String clientName, String clientPhone, String clientPetName, Boolean isMember, String clientEmail) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.clientPetName = clientPetName;
        this.isMember = isMember;
        this.clientEmail = clientEmail;
    }

    public Reference() {

    }

    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientPetName() {
        return clientPetName;
    }

    public void setClientPetName(String clientPetName) {
        this.clientPetName = clientPetName;
    }

    public Boolean getMember() {
        return isMember;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reference)) return false;
        Reference reference = (Reference) o;
        return Objects.equals(id, reference.id) && Objects.equals(clientName, reference.clientName) && Objects.equals(clientPhone, reference.clientPhone) && Objects.equals(clientPetName, reference.clientPetName) && Objects.equals(isMember, reference.isMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientName, clientPhone, clientPetName, isMember);
    }


    @Override
    public String toString() {
        return "Reference{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientPetName='" + clientPetName + '\'' +
                ", isMember=" + isMember +
                '}';
    }
}