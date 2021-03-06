public class Solution {
	public boolean isMatch(String s, String p) {
		if (p.contains(".") || p.contains("*")) {
			if (p.length() == 1 || p.charAt(1) != '*') return comp(s, p, 0) && isMatch(s.substring(1), p.substring(1));
			for (int i = 0; i == 0 || comp(s, p, i - 1); i++) {
				if (isMatch(s.substring(i), p.substring(2))) return true;
			}
			return false;
		}
		return s.equals(p);
	}

	private boolean comp(String s, String p, int i) {
		return i < s.length() && (p.charAt(0) == s.charAt(i) || p.charAt(0) == '.');
	}
}