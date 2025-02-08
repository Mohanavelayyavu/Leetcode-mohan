struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *prev,*cur,*nxt;
    prev = NULL;
    cur = nxt = head;
    while(nxt!=NULL)
    {
        nxt=nxt->next;
        cur->next=prev;
        prev=cur;
        cur=nxt;
    }
    return prev;
}
