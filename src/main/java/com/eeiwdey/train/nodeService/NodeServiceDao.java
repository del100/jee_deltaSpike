package com.eeiwdey.train.nodeService;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class NodeServiceDao {
	
	private List<Node> nodes = new ArrayList<Node>();
	private int id = 0;

	public void addNode(Node node) {
		node.setId(++id);
		nodes.add(node);
	}
	
	public Node getNodeByName(String name) {
		Node node = null;
		for (Node n : nodes) {
			if (n.getName().equals(name))
				node = n;
		}
		return node;
	}

	public Node getNodeById(int id) {
		Node node = null;
		for (Node n : nodes) {
			if (n.getId() == id)
				node = n;
		}
		return node;
	}
}
