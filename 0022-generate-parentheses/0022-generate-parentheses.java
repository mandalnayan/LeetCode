class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        
        generate(n, n, "", list);
        
        return list;
    }
    
    // Function to generate all well-formed parenntheses
    void generate(int op, int cl, String cs, List<String> list) {
        if (op > cl) return;
        
        if (op == 0) {
            while (cl-- > 0) cs += ")";
            list.add(cs);
        } else {
           generate(op-1, cl, cs+"(" , list);
           generate(op, cl-1,  cs+")", list);            
        }
    }
}