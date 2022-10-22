   const{v4} =  require("uuid")
   const AWS =  require("aws-sdk")


const addToDo = async (event) => {

  const dynamoDB = new AWS.DynamoDB.DocumentClient();
  const { todo }=JSON.parse(event.body);
  const createdAt = new Date().toISOString;
  const id = v4();
  console.log("This is an ID", id)
 // const dynamoDB = aws.dynamoDB.DocumentClient();

 const newTodo ={

  id,
  todo,
  createdAt,
  completed:false

 }

 await dynamoDB.put({

  TableName: "TodoTable",
  Item: newTodo
}).promise();

  return {
    statusCode: 200,
    body: JSON.stringify(newTodo),
  };
};

module.exports = {

  handler:addToDo
}
