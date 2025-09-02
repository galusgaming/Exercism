//
// This is only a SKELETON file for the 'RNA Transcription' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

// You can find the full description of the exercise at
// https://exercism.org/tracks/javascript

export const toRna = (dna) => {
    let rna = "";
    const rnaNucleotides = ['G', 'C', 'T', 'A', 'U'];
    for (let i = 0; i < dna.length; i++) {
      if (dna[i] === 'G') {
        rna += rnaNucleotides[1]; // C
      } else if (dna[i] === 'C') {
        rna += rnaNucleotides[0]; // G
      } else if (dna[i] === 'T') {
        rna += rnaNucleotides[3]; // A
      } else if (dna[i] === 'A') {
        rna += rnaNucleotides[4]; // U
      }
  
  }
  return rna;
};
