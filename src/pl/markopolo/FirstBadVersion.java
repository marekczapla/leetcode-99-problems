package pl.markopolo;

public class FirstBadVersion {
    public boolean isBadVersion(int n) {
        if(n > 5)  {
            return true;
        }
        return false;
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
