package com.eeiwdey.train.nodeService;

import static org.junit.Assert.assertEquals;

import javax.ejb.EJB;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.eeiwdey.train.nodeService.Node;
import com.eeiwdey.train.nodeService.NodeService;

@RunWith(CdiTestRunner.class)
public class NodeServiceTest {

	@EJB
	NodeService nodeService;
	
	@Test
	public void addNode() {
		Node node = createTestNode();
		nodeService.addNode(node);
		assertEquals("testNode", nodeService.getNodeByName("testNode").getName());
		assertEquals(1, nodeService.getNodeById(1).getId());
		assertEquals("testNode", nodeService.getNodeById(1).getName());
	}
	
	private Node createTestNode() {
		Node node = new Node();
		node.setLatitude(10);
		node.setLongitude(20);
		node.setName("testNode");
		return node;
	}
}
