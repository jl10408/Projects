public class Towers {

    // this function moves disks from one rod to another recursivly
    public void solve(int n, String from, String to, String aux) {

        // base case - if theres just 1 disk, move it
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // recursive step, move n-1 to aux rod
        solve(n - 1, from, aux, to);

        // now move the biggest disk to the destination
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // move the rest from aux to the target
        solve(n - 1, aux, to, from);
    }

    // not using this but was gonna test something here
    public void test() {
        System.out.println("testing");
    }
}
