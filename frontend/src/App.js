import {useEffect, useState} from "react";
import {userService} from "./services";

const App = () => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        userService.getAll().then(({data}) => setUsers(data))
    }, [])

    return (
        <div>
            <h1>Users:</h1>
            {users.map(user => <div key={user.id}>{JSON.stringify(user)}</div>)}
        </div>
    );
};

export default App;
