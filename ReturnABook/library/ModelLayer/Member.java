package library.ModelLayer;

/**
 * Represents a library member.
 * This is part of the MODEL layer.
 */
public class Member {

    private String memberId; // Unique ID for the member
    private String name;     // Member full name

    // Constructor: used when creating a new member
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters (to read data)
    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    // Returns a readable text for display
    @Override
    public String toString() {
        return memberId + " - " + name;
    }
}

