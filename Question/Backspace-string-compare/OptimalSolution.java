
class OptimalSolution {
    public boolean backspaceCompare(String s, String t) {
        int p1 = s.length() - 1;
		int p2 = t.length() - 1;
		
		while (p1 >= 0 || p2 >= 0) {
			if ((p1 >= 0 && s.charAt(p1) == '#') || (p2 >= 0 && t.charAt(p2) == '#')) {

				if (p1 >= 0 && s.charAt(p1) == '#') {
					int backCount = 2;
					while (backCount > 0) {
						p1--;
						backCount--;

						if (p1 >= 0 && s.charAt(p1) == '#')
							backCount+=2;
					}
				}

				if (p2 >= 0 && t.charAt(p2) == '#') {
					int backCount = 2;
					while (backCount > 0) {
						p2--;
						backCount--;

						if (p2 >= 0 && t.charAt(p2) == '#')
							backCount+=2;
					}
				}
			}
			else {
                if (p1 < 0 || p2 < 0) {
                    return false;
                }
				// current pointer is not a #
				if (s.charAt(p1) != t.charAt(p2)) {
					return false;
				}
				p1--;
				p2--;
			}
		}

		return true;
    }
}