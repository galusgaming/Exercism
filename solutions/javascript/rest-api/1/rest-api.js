
export class RestAPI {
  constructor({ users }) {
    this.users = users;
  }

  createUser(name) {
    let newUser = { name: name, owes: {}, owed_by: {}, balance: 0 };
    this.users.push(newUser);
    return newUser;
  }

  get(url) {
    if (url === "/users") return { users: this.users };
    let userName = url.split("=")[1];
    for (const user of this.users) {
      if (user.name === userName) return { users: [user] };
    }
    return { users: [] };
  }

  post(url, payload) {
    if (url === "/add") {
      return this.createUser(payload.user);
    }
    if (url === "/iou") {
      let lender, borrower;
      for (const user of this.users) {
        if (user.name === payload.lender) {
          lender = user;
          lender.balance += payload.amount;

          let diff = (lender.owes[payload.borrower] || 0) - payload.amount;

          if (diff > 0) {
            lender.owes[payload.borrower] -= payload.amount;
          }
          if (diff === 0) {
            delete lender.owes[payload.borrower];
          }
          if (diff < 0) {
            delete lender.owes[payload.borrower];
            lender.owed_by[payload.borrower] =
              lender.owed_by[payload.borrower] || 0 - diff;
          }
        }
        if (user.name === payload.borrower) {
          borrower = user;
          borrower.balance -= payload.amount;

          let diff = (borrower.owed_by[payload.lender] || 0) - payload.amount;
          console.log(diff);
          if (diff > 0) {
            borrower.owed_by[payload.lender] -= payload.amount;
          }
          if (diff === 0) {
            delete borrower.owed_by[payload.lender];
          }
          if (diff < 0) {
            delete borrower.owed_by[payload.lender];
            borrower.owes[payload.lender] =
              borrower.owes[payload.lender] || 0 - diff;
          }
        }
      }
      let returnedUsers = [lender, borrower].sort((userA, userB) =>
        userB.name > userA.name ? -1 : 1
      );
      return { users: returnedUsers };
    }
  }
}
