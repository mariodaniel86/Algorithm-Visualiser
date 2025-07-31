#include <stdlib.h>
#include <stdio.h>

typedef struct Edge {
    Node destinationNode;
    Node sourceNode;
} Edge;

typedef struct Node {
    Edge *edges;
    int numberOfEdges;
} Node;
