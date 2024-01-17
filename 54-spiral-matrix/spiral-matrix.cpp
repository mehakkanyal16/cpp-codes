class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
       vector<int>res;
           int m=matrix.size();
           int n=matrix[0].size();
           if(m==0){
               return res;
           }
           if(n==0){
               return res;
           }
           int top=0;
           int bottom=m-1;
           int left=0;
           int right=n-1;
           while(top<=bottom&&left<=right){
               for(int i=left;i<=right;i++){
                   res.push_back(matrix[top][i]);
               }
               top++;
               for(int i=top;i<=bottom;i++){
                   res.push_back(matrix[i][right]);
               }
               right--;
               if(top<=bottom){
               for(int i=right;i>=left;i--){
                   res.push_back(matrix[bottom][i]);
               }
               bottom--;
               }
               if(left<=right){
               for(int i=bottom;i>=top;i--){
                   res.push_back(matrix[i][left]);

               }
               left++;
               }
           }
       
       return res; 
    }
};