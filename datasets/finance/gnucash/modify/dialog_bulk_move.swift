import SwiftUI
struct dialog_bulk_move: View {
    
    var body: some View {
        VStack
        {
            Text("Destination Account")
                .padding(.top,5)
                .padding(.bottom)
                .padding(.leading,10)
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .listStyle(PlainListStyle())
            .padding(.bottom,10)
            .padding(.leading,10)
            .padding(.trailing,10)
            VStack
            {
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
                HStack
                {
                    Button(action: {})
                    {
                        Text("Cancel")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                    Button(action: {})
                    {
                        Text("Save")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .padding(.top,5)
        }
        .frame(minWidth:0,maxWidth:.infinity)
        .padding(10)}}

struct dialog_bulk_move_Previews: PreviewProvider {
    static var previews: some View {
        dialog_bulk_move()
    }
}
