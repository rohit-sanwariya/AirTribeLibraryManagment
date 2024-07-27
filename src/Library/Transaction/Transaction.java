package Library.Transaction;

import java.util.Date;

public record Transaction(java.util.UUID id, int memberId, Date date, int bookId, Date dueDate, ETransactionType transactionType) {
}
