class Solution {
    
    static int count;
    static int[][] arr;
    static int[] distance;
    static boolean[] visited;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        count = 0;
        arr = new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = 500001;
            }
        }
        
        for(int i=0;i<road.length;i++){
            if(arr[road[i][0]-1][road[i][1]-1] > road[i][2]){
                arr[road[i][0]-1][road[i][1]-1] = road[i][2];
                arr[road[i][1]-1][road[i][0]-1] = road[i][2];
            }
        }
        
        distance = new int[N];
        
        for(int i=1;i<N;i++){
            distance[i] = 500001;
        }
        
        visited = new boolean[N];
        
        dijkstra(N);
        
        for(int i=0;i<N;i++){
            if(distance[i]<=K){
                count++;
            }
        }
        
        answer = count;
        
        return answer;
    }
    
    static void dijkstra(int N){
        
        for(int i=0;i<N-1;i++){
            int min = 500001;
            int idx = 0;
            
            for(int j=1;j<N;j++){
                if(!visited[j] && min > distance[j]){
                    idx = j;
                    min = distance[j];
                }
            }
            
            visited[idx] = true;
            
            for(int j=1;j<N;j++){
                if(distance[j] > distance[idx]+arr[idx][j]){
                    distance[j] = distance[idx]+arr[idx][j];
                }
            }
        }
    }
}