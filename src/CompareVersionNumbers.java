/**
 * Created by GelinZHU on 3/31/17.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
      String[] arr1 = version1.split("\\.");
      String[] arr2 = version2.split("\\.");

      int i = 0;

      while(i < arr1.length || i < arr2.length ) {
          if (i < arr1.length && i < arr2.length) {
              int j = Integer.parseInt(arr1[i]);
              int k = Integer.parseInt(arr2[i]);
              if (j > k) {
                  return 1;
              } else if (j < k) {
                  return -1;
              }
          } else if (i < arr1.length) {
              if (Integer.parseInt(arr1[i]) != 0) {
                  return 1;
              }
          } else if (i < arr2.length) {
              if (Integer.parseInt(arr2[i]) != 0) {
                  return -1;
              }
          }
          i++;
      }

      return 0;
    }

    public static void main(String[] args) {
        String v1 = "01";
        String v2 = "1";

        CompareVersionNumbers cn = new CompareVersionNumbers();
        System.out.println(cn.compareVersion(v1, v2));
    }
}
