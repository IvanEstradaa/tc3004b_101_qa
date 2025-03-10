function sum() {
    //const num1 = document.getElementById('num1').value;
    //const num2 = document.getElementById('num2').value;

    //let result;
    //result = Number(num1) + Number(num2);

    //document.getElementById('result').innerText = "Result: " + result;

    const num1 = document.getElementById('num1').value;
    const num2 = document.getElementById('num2').value;

    fetch(`http://localhost:8080/add?num1=${num1}&num2=${num2}`)
        .then(response => response.json())
        .then(data => {
            document.getElementById('result').innerText = "Result: " + data.result;
        })
        .catch(err => {
            console.log(err);
        });
}

function sub() {
    // const num1 = document.getElementById('num1').value;
    // const num2 = document.getElementById('num2').value;

    // let result;
    // result = Number(num1) - Number(num2);

    // document.getElementById('result').innerText = "Result: " + result;

    const num1 = document.getElementById('num1').value;
    const num2 = document.getElementById('num2').value;

    fetch(`http://localhost:8080/sub?num1=${num1}&num2=${num2}`)
        .then(response => response.json())
        .then(data => {
            document.getElementById('result').innerText = "Result: " + data.result;
        })
        .catch(err => {
            console.log(err);
        });
}

function resetFields() {
    document.getElementById('num1').value = "";
    document.getElementById('num2').value = "";
    document.getElementById('result').innerText = "Result:";
}