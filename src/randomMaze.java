import java.util.Random;

public class randomMaze{

    public static void main(String[] args){
        int maze[][] = new int[64][64];
        int random;
        boolean end = false;
        int x=0, y=0;

        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                if(i == 0 || i == maze.length-1){
                    maze[i][j] = 2;
                }
                else if(j == 0 || j == maze[i].length-1){
                    maze[i][j] = 3;
                }
                else{
                    random = (int) (Math.random()*((1-0)+1))+ 0;
                    maze[i][j] = random;
                }
            }
        }

        maze[1][1] = 0;

        while(!end){
            random = (int) (Math.random()*((3-1)+1))+ 1;
            
            if(random == 1 & y != maze[x].length-1 & x != maze.length-1){
                x+=1;
                maze[x][y] = 0;
            }
            else if(random == 2 & y != maze[x].length-1 & x != maze.length-1){
                x+=1;
                y+=1;
                maze[x][y] = 0;
            }
            else if(random == 3 & y != maze[x].length-1 & x != maze.length-1){
                y+=1;
                maze[x][y] = 0;
            }
            else{
                end = true;
            }
            
        }

        for(int k = 0; k < maze.length; k++){
            for(int l = 0; l < maze[k].length; l++){
                if(maze[k][l] == 1){
                    System.out.print(" + " );
                }
                else if(maze[k][l] == 2){
                    System.out.print(" - " );
                }
                else if(maze[k][l] == 3){
                    System.out.print(" | " );
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }
}