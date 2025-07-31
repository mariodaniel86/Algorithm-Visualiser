#ifndef GRAPH_H
#define GRAPH_H

typedef struct Edge {
    Node destinationNode;
    Node sourceNode;
} Edge;

typedef struct Node {
    Edge *edges;
    int numberOfEdges;
} Node;

#endif
