package Aadhaar_Pan;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    // write static if you want static block
    private Map<String, AadhaarCard> aadhaarMap = new HashMap<>();

    public void setAadhaarMap(String aadhaarNumber, AadhaarCard panCard) {
        aadhaarMap.put(aadhaarNumber, panCard);
    }

    public AadhaarCard getAadhaar(String aadhaarNumber) {
        return aadhaarMap.get(aadhaarNumber);
    }
}
