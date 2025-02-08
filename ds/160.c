struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    struct ListNode *temp1 = headA;
    struct ListNode *temp2 = headB;
    while(temp1!=NULL)
    {
        temp2 = headB;
        while(temp2!=NULL)
        {
            if(temp1==temp2)
            {
                return temp1;
            }
            temp2 = temp2->next;
        }
        temp1 = temp1->next;
    }
    return NULL;
}
