bool hasCycle(struct ListNode *head) {
    struct ListNode *temp1 = head;
    struct ListNode *temp2 = head;
    while(temp2!=NULL && temp2->next!=NULL)
    {
        temp1 = temp1->next;
        temp2 = temp2->next->next;
        if(temp1==temp2)
        {
            return true;
        }
    }
    return false;
}
