class Solution {
    public List<String> generateParenthesis(int n) {
        
        return generate(n, n, "", new ArrayList<String>());
    }
    
    // Function to generate all well-formed parenntheses
    List<String> generate(int op, int cl, String cs, List<String> list) {
        if (op > cl) return list;
        
        if (op == 0) {
            while (cl-- > 0) cs += ")";
            list.add(cs);
        } else {
           list = generate(op-1, cl, cs+"(" , list);
           list = generate(op, cl-1,  cs+")", list);            
        }
        return list;
    }
}