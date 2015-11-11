import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Board {
    
    private final int[][] answer;
    public int[][] puzzle;
    Random randomGenerator = new Random();
    ArrayList randList = new ArrayList();
    ArrayList[] notTried = new ArrayList[81];
    
    /**
     * Constructor generates the board, copies it
     * to a puzzle board and removes spaces.
     */    
    public Board(int diff){
        answer = new int[9][9];
        puzzle = new int[9][9];
        generate();
        for(int i =0; i<9; i++){
            System.arraycopy(answer[i], 0, puzzle[i], 0, 9);
        }
        puzzle = remove(diff, puzzle);
    }
    
    /**
     * Generates a valid board.
     */
    private void generate(){
        int position = 0;
            for(int i = 0; i<81; i++){
                notTried[i] = new ArrayList();
                for(int j = 1; j<10; j++){
                    notTried[i].add(j);
                 }
            }
            for(int i =0; i<9; i++){
                for(int k = 0; k<9; k++){
                    if(!notTried[position].isEmpty()){
                        int temp = (int) notTried[position].get(randomGenerator.nextInt(notTried[position].size()));
                        if(checkValid(i,k,temp)){
                            answer[i][k] = temp;
                            Integer num = temp;
                            notTried[position].remove(num);
                            position++;
                        }
                        else{
                            Integer num = temp;
                            notTried[position].remove(num);
                            if(k==0){
                                i--;
                                k=8;                              
                            }
                            else{
                                k--;
                            }
                        }
                    }
                    else{
                        for(int j = 1; j<10; j++){
                            notTried[position].add(j);
                        }
                        if(k==0){
                                i--;
                                k=8;                              
                            }
                            else{
                                k--;
                            }
                        answer[i][k] = 0;
                        position--;
                        if(k==0){
                                i--;
                                k=8;                              
                            }
                            else{
                                k--;
                            }
                    }
                }
            }
        }
    
    
    /**
     * Takes the x and y position of a box and the possible
     * number, and checks if that number is valid in that
     * position. Returns true if it is, false if not.
     */
    private boolean checkValid(int x, int y, int num){
        int subx = 0;
        int suby = 0;
        for(int i=0; i<9; i++){
            if(answer[x][i] == num){
                return false;
            }
        }
        for(int i=0; i<9; i++){
            if(answer[i][y] == num){
                return false;
            }
        }
        if(x<3){
            subx = 0;
        }
        if(x>2 && x<6){
            subx = 3;
        }
        if(x>5){
            subx = 6;
        }
        if(y<3){
            suby = 0;
        }
        if(y>2 && y<6){
            suby = 3;
        }
        if(y>5){
            suby = 6;
        }
        for(int i=subx; i<subx+3;i++){
            for(int k=suby; k<suby+3; k++){
                if(answer[i][k] == num){
                    return false;
                }
            }
        }
        return true;    
    }

    /**
     * Returns the answer board.
     * @return answer
     */
    public int[][] getAnswer() {
        return answer;
    }
    
    /**
     * Randomly removes the specified number of numbers
     * from the puzzle.
     */
    private int[][] remove(int num, int[][] puzzle){
        ArrayList temp = new ArrayList();
        for(int i = 0; i<81; i++){
            temp.add(i);
        }
        Collections.shuffle(temp);
        for(int i = 0; i<num; i++){
            puzzle[(int) temp.get(i)/9][(int) temp.get(i)%9] = 0;
        }
        return puzzle;
    }
    
    /**
     * Checks if the input board is the same as the answer.
     * @return 
     */
    public boolean checkAnswer(){
        for(int i =0; i<9; i++){
            for(int k = 0; k<9; k++){
                if(answer[i][k] != puzzle[i][k]){
                    return false;
                }
            }
        }
        return true;
    }
}
