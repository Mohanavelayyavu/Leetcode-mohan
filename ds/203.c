struct ListNode* removeElements(struct ListNode* head, int val)
 {
    struct ListNode* temp = head;

    while (temp != NULL && temp->val == val) {
        head = temp->next;  
        temp = head;       
    }

    while (temp != NULL && temp->next != NULL)
     {
        if (temp->next->val == val) {
            temp->next = temp->next->next;  
        } else {
            temp = temp->next; 
        }
    }

    return head;
}
