# IA - Search Agents

These are the search agents where your goal is to find a set of instructions that lead to a solution. First we will give a brief description of the agents.

**Bredth-First Search Agent** (AgentBFS) is an agent performs its actions by expanding each node and them adding to the end of fringe.

**Depth-First Search Agent** (AgentDFS) is an agent  performs its actions by plunging deeply into the expansions of each node.

The other agents are a variation of these two.

**AgentDFS with explored list** is a variation of AgentDFS, however this agent has a list that stores all nodes already visited.

**Agent Depth Limited Search** (AgentDLS) is an variation of AgentDFS, but now it has a depth limit on which it can reach.

**Agent Iterative Deepening Search** (AgentIDS) it is an improved variation of AgentDLS, it has an iterative level that varies according to the search result. It expands all nodes of the level, if it does not find the goal, increases the level of the tree begins the search again.

**Uniform-Cost Search Agent** (AgentUCS) is an variation of AgentBFS, this agent always looks for the lowest costs of the instruction sets.



## Resources
- \+ AgentBFS (Breadth-First Search).
- \+ AgentDFS (Depth-First Search).
- \+ AgentDFS with explored list.
- \+ AgentDLS (Depth Limited Search)
- \+ AgentIDS (Iterative Deepening Search)
- \+ AgentUCS (Uniform-Cost Search).



        ![Romania's Map](http://i1.wp.com/aiandgames.com/wp-content/uploads/2015/12/romania-graph.png)
