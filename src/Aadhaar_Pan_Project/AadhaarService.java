package Aadhaar_Pan_Project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    // write static if you want static block
    private Map<String, AadhaarCard> aadhaarMap = new HashMap<>();

    public void setAadhaarMap(String aadhaarNumber, AadhaarCard aadhaarCard) {
        aadhaarMap.put(aadhaarNumber, aadhaarCard);
    }

    public AadhaarCard getAadhaar(String aadhaarNumber) {
        for (AadhaarCard aadhaar : aadhaarMap.values()) {
            if (aadhaar.getAadhaarNumber().equalsIgnoreCase(aadhaarNumber)) {
                return aadhaar;
            }
        }
        return null;
    }
}
