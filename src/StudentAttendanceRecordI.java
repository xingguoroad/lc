/**
 * Created by GelinZHU on 4/25/17.
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int cntA = 0;
        int cntL = 0;

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'A') {
                cntA++;
                if (cntA > 1) {
                    return false;
                }
                cntL = 0;
            } else if (c[i] == 'L') {
                cntL++;
                if (cntL > 2) {
                    return false;
                }
            } else {
                cntL = 0;
            }
        }
        return true;
    }
}
