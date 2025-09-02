//
// This is only a SKELETON file for the 'RNA Transcription' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

// You can find the full description of the exercise at
// https://exercism.org/tracks/javascript

export const toRna = (dna) => {
    let rna = "";
    for (let i = 0; i < dna.length; i++) {
      if (dna[i] === 'G') {
        rna += 'C';
      } else if (dna[i] === 'C') {
        rna += 'G';
      } else if (dna[i] === 'T') {
        rna += 'A';
      } else if (dna[i] === 'A') {
        rna += 'U';
      }
    
  }
  return rna;
};
