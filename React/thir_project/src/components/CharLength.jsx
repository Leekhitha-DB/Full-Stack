import React, { useState } from "react";

export const CharLength = () => {
    const [userInput , setUserInput] = useState(0);
  return (
    <>
        <textarea
        name="address"
        id="address"
        rows={6} 
        cols={16}
        onCharge ={(e) => setUserInput(e.target.value)}
        ></textarea>
        <div>Charcter Count: {userInput.length}</div>
    </>
  );
};