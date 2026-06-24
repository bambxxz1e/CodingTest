function solution(sizes) {
    width = 0;
    height = 0;
    
    sizes.map((v, i) => {
        sizes[i].sort((a, b) => a - b);
        width = Math.max(width, sizes[i][0]);
        height = Math.max(height, sizes[i][1]);
    })
    
    return width * height;
}