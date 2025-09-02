//
// This is only a SKELETON file for the 'RNA Transcription' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

// You can find the full description of the exercise at
// https://exercism.org/tracks/javascript

const rnaMap = {
    'G': 'C',
    'C': 'G',
    'T': 'A',
    'A': 'U'
};
export const toRna = (dna) => dna.split('').map(nucleotide => {
    if (!rnaMap[nucleotide]) {
        return '';
    }
    return rnaMap[nucleotide];
}).join(''); 
