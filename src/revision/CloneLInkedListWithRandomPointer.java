package revision;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import linked.list.LinkedListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CloneLInkedListWithRandomPointer {

    private static class LinkListNode {
        int data;
        LinkListNode next;

        LinkListNode random;

        LinkListNode(int data) {
            this.data = data;
            next = null;
            random = null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinkListNode that = (LinkListNode) o;
            return data == that.data &&
                    Objects.equals(next, that.next) &&
                    Objects.equals(random, that.random);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }

    public static void main(String[] args) {

        LinkListNode start = new LinkListNode(10);
        createLinkedList(start);

        printListWithRandAndNextPtr(start);

        //1. Cloning list using collections
        //Map<LinkListNode, LinkListNode> map = new HashMap<>();
        //cloneListUsingCollections(map, start);
        //System.out.println();
        //LinkListNode newList = map.get(start);
        //printListWithRandAndNextPtr(newList);


        //2. Cloning list without using collections
        System.out.println();
        LinkListNode secondNewList = cloneListUsing(start);
        printListWithRandAndNextPtr(secondNewList);
    }

    public static void createLinkedList(LinkListNode start) {
        start.next = new LinkListNode(20);
        start.next.next = new LinkListNode(30);
        start.next.next.next = new LinkListNode(40);
        start.next.next.next.next = new LinkListNode(50);

        start.random = start.next.next.next;
        start.next.random = start.next.next.next.next;
        start.next.next.random = start.next.next.next;
        start.next.next.next.random = start.next;
        start.next.next.next.next.random = start.next.next;
    }

    public static void printListWithRandAndNextPtr(LinkListNode start) {

        LinkListNode temp = start;
        int i = 1;

        while (null != temp) {
            int data = null != temp.next ? temp.next.data : -1;
            System.out.print(i + "th element is: " + temp.data + " and next element is: " + data + " and random element is: " + temp.random.data);
            temp = temp.next;
            i++;
            System.out.println();
        }
    }

    public static void cloneListUsingCollections(Map<LinkListNode, LinkListNode> map, LinkListNode start) {
        LinkListNode temp = start;

        while (null != temp) {
            map.put(temp, new LinkListNode(temp.data));
            temp = temp.next;
        }

        temp = start;
        while (null != temp) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
    }

    public static LinkListNode cloneListUsing(LinkListNode start) {
        LinkListNode temp = start;

        while (null != temp) {
            LinkListNode newNode = new LinkListNode(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        temp = start;
        LinkListNode newStart = temp.next;

        while (null != temp) {
            temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = start;
        while (null != temp) {
            LinkListNode newTemp = temp.next.next;

            if (null != newTemp)
                temp.next.next = temp.next.next.next;

            temp = newTemp;
        }

        return newStart;
    }
}





