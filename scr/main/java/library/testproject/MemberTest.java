package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.ModelLayer.Member;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    public void testMemberCreation() {
        // Create a new Member object with ID and name.
        Member member = new Member("M1", "Ranya");

        // Verify that member ID is correct
        assertEquals("M1", member.getMemberId());

        // Verify that member name is correct
        assertEquals("Ranya", member.getName());
    }
}
