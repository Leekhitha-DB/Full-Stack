import React from 'react'

export default function FirstComponent(props) {
    console.log(props.count);
    console.log(props.data);
    const styles = {
        border: "2px solid red" , 
        margin: "10px" ,
    }
  return (
    <>
        <div style={styles}>
            This is a First Component {props.count} - {props.data}
        </div>
        <h2 style={styles}>This is a SubHeading</h2>
    </>
  );
}