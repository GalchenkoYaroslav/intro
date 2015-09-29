/**
 * Created by ������� on 28.09.2015.
 */
package com.gojava6;
public class IslandProblemResolving  implements Island{

    private int[][] islandMap;
    int rowLength;
    int colLength;
    public IslandProblemResolving(int[][] islandMap) {
        this.islandMap = islandMap;
        this.rowLength = islandMap.length;
        this.colLength = islandMap[0].length;
    }
    public boolean isIsland(int r, int c, int[][] islandMap) {
        if (islandMap[r][c] == 1) {
            islandMap[r][c] = 0;
            if (r - 1 >= 0) isIsland(r - 1, c, islandMap);
            if (r + 1 < rowLength) isIsland(r + 1, c, islandMap);
            if (c - 1 >= 0) isIsland(r, c - 1, islandMap);
            if (c + 1 < colLength) isIsland(r, c + 1, islandMap);
            return true;
        }
        return false;
    }
    public int countIslands() {
        int total = 0;
        for (int r = 0; r < rowLength; r++) {
            for (int c = 0; c < colLength; c++) {
                if (isIsland(r, c, islandMap)) {
                    total++;
                }
            }
        }
        return total;
    }
}
