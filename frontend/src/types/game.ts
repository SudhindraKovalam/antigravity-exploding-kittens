export enum CardType {
    EXPLODING_KITTEN = 'EXPLODING_KITTEN',
    DEFUSE = 'DEFUSE',
    ATTACK = 'ATTACK',
    SKIP = 'SKIP',
    FAVOR = 'FAVOR',
    SHUFFLE = 'SHUFFLE',
    SEE_THE_FUTURE = 'SEE_THE_FUTURE',
    NOPE = 'NOPE',
    FERAL_CAT = 'FERAL_CAT',
    CATTERMELON = 'CATTERMELON',
    HAIRY_POTATO_CAT = 'HAIRY_POTATO_CAT',
    RAINBOW_RALPHING_CAT = 'RAINBOW_RALPHING_CAT',
    TACOCAT = 'TACOCAT',
    BEARD_CAT = 'BEARD_CAT',
    ALTER_THE_FUTURE = 'ALTER_THE_FUTURE',
    DRAW_FROM_BOTTOM = 'DRAW_FROM_BOTTOM',
    SWAP_TOP_AND_BOTTOM = 'SWAP_TOP_AND_BOTTOM',
    TARGETED_ATTACK = 'TARGETED_ATTACK',
    STREAKING_KITTEN = 'STREAKING_KITTEN'
}

export interface Card {
    id: string;
    type: CardType;
    title: string;
    description: string;
    imageUrl?: string;
}

export interface Player {
    id: string;
    name: string;
    hand: Card[];
    isEliminated: boolean;
    hasDefuse: boolean;
}

export interface Deck {
    cards: Card[]; // Note: In a real game, clients shouldn't see the whole deck, but for modeling...
    remainingCards: number;
}

export interface GameState {
    players: Player[];
    drawPile: Deck; // Or just card count for clients
    discardPile: Card[];
    currentPlayerIndex: number;
    actionsRemaining: number;
    // helper to get current player
    // currentPlayer: Player; // Computed property usually
}
