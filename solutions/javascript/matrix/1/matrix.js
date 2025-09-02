//
// This is only a SKELETON file for the 'Matrix' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Matrix {
  constructor(matrixString) {
    this.matrix = matrixString.split('\n')
  }

  get rows() {
    return this.matrix.map(row => {
      return row.split(' ').map(Number);
    });
  }

  get columns() {
    return this.rows[0].map((_, colIndex) => this.rows.map(row => row[colIndex]));
  }
}
